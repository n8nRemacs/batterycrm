package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
public final class w8c implements DisplayManager.DisplayListener {
    public final /* synthetic */ a9c a;

    public w8c(a9c a9cVar) {
        this.a = a9cVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        a9c a9cVar = this.a;
        Display display = a9cVar.getDisplay();
        if (display == null || display.getDisplayId() != i) {
            return;
        }
        a9cVar.b();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
