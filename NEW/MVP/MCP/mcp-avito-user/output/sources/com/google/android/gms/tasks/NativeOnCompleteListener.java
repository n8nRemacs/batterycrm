package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
@RX0.a
/* loaded from: classes6.dex */
public class NativeOnCompleteListener implements InterfaceC37022e<Object> {
    @RX0.a
    public native void nativeOnComplete(long j12, @j.P Object obj, boolean z12, boolean z13, @j.P String str);

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    @RX0.a
    public final void onComplete(@j.N Task<Object> task) {
        Object objN;
        String message;
        Exception excM;
        if (task.r()) {
            objN = task.n();
            message = null;
        } else if (task.p() || (excM = task.m()) == null) {
            objN = null;
            message = null;
        } else {
            message = excM.getMessage();
            objN = null;
        }
        nativeOnComplete(0L, objN, task.r(), task.p(), message);
    }
}
