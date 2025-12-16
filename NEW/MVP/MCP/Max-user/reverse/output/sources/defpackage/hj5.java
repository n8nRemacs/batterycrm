package defpackage;

/* loaded from: classes.dex */
public final class hj5 implements qn6 {
    public final String a;

    public /* synthetic */ hj5(String str) {
        this.a = str;
    }

    @Override // defpackage.qn6
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.qn6
    public void onFailure(Throwable th) {
        a8i.m("MediaNtfMng", "custom command " + this.a + " produced an error: " + th.getMessage(), th);
    }
}
