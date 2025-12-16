package com.yandex.runtime.view.internal;

import android.view.MotionEvent;
import com.yandex.runtime.bindings.internal.ArchiveWriter;

/* loaded from: classes8.dex */
public class TouchEvent {

    public enum Type {
        BEGAN,
        ENDED,
        MOVED,
        CANCELED
    }

    private static boolean filterAction(MotionEvent motionEvent, int i12) {
        return (motionEvent.getActionMasked() == 6 && motionEvent.getActionIndex() == i12) ? false : true;
    }

    private static int getFilteredActionsCount(MotionEvent motionEvent) {
        int i12 = 0;
        for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
            if (filterAction(motionEvent, i13)) {
                i12++;
            }
        }
        return i12;
    }

    private static Type getType(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            return Type.BEGAN;
        }
        if (actionMasked == 1) {
            return Type.ENDED;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                return Type.CANCELED;
            }
            if (actionMasked != 5 && actionMasked != 6) {
                return null;
            }
        }
        return Type.MOVED;
    }

    public static boolean isTouchEvent(MotionEvent motionEvent) {
        return getType(motionEvent) != null;
    }

    public static void serialize(MotionEvent motionEvent, ArchiveWriter archiveWriter) {
        archiveWriter.add((ArchiveWriter) getType(motionEvent), false, (Class<ArchiveWriter>) Type.class);
        archiveWriter.add(motionEvent.getEventTime());
        archiveWriter.add(getFilteredActionsCount(motionEvent));
        for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
            if (filterAction(motionEvent, i12)) {
                archiveWriter.add(motionEvent.getPointerId(i12));
                archiveWriter.add(motionEvent.getX(i12));
                archiveWriter.add(motionEvent.getY(i12));
            }
        }
    }
}
