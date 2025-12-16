package com.avito.android.sx_address.new_address.view;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f293926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f293927c;

    public /* synthetic */ o(r rVar, int i12) {
        this.f293926b = i12;
        this.f293927c = rVar;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v6, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f293926b) {
            case 0:
                r rVar = this.f293927c;
                B b12 = rVar.f293941k;
                Y41.a<Boolean> aVar = b12.f293856f;
                if ((aVar != null ? (Boolean) ((C) aVar).invoke() : null) != null) {
                    rVar.f293944n.p(b12.f293851a.getTop());
                    break;
                }
                break;
            case 1:
                r rVar2 = this.f293927c;
                rVar2.f293944n.p(rVar2.f293943m.f293903a.getTop());
                break;
            case 2:
                r rVar3 = this.f293927c;
                z zVar = rVar3.f293940j;
                if (((Boolean) zVar.f294011c.invoke()).booleanValue()) {
                    rVar3.f293944n.p(zVar.f294009a.getTop());
                    break;
                }
                break;
            case 3:
                r rVar4 = this.f293927c;
                C35196c c35196c = rVar4.f293938h;
                if (((Boolean) c35196c.f293884h.invoke()).booleanValue()) {
                    rVar4.f293944n.p(c35196c.f293877a.getTop());
                    break;
                }
                break;
            default:
                this.f293927c.f293944n.e(130);
                break;
        }
    }
}
