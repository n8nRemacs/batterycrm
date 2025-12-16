package com.google.android.material.badge;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import j.N;
import j.P;
import java.lang.ref.WeakReference;

/* compiled from: BadgeUtils.java */
@h
/* loaded from: classes6.dex */
public class g {
    public static void a(@N b bVar, @N View view) {
        c(bVar, view);
        WeakReference<FrameLayout> weakReference = bVar.f355892n;
        if ((weakReference != null ? weakReference.get() : null) == null) {
            view.getOverlay().add(bVar);
        } else {
            WeakReference<FrameLayout> weakReference2 = bVar.f355892n;
            (weakReference2 != null ? weakReference2.get() : null).setForeground(bVar);
        }
    }

    public static void b(@P b bVar, @N View view) {
        if (bVar == null) {
            return;
        }
        WeakReference<FrameLayout> weakReference = bVar.f355892n;
        if ((weakReference != null ? weakReference.get() : null) == null) {
            view.getOverlay().remove(bVar);
        } else {
            WeakReference<FrameLayout> weakReference2 = bVar.f355892n;
            (weakReference2 != null ? weakReference2.get() : null).setForeground(null);
        }
    }

    public static void c(@N b bVar, @N View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        bVar.setBounds(rect);
        bVar.f(view, null);
    }
}
