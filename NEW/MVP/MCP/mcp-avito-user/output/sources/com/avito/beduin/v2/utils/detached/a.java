package com.avito.beduin.v2.utils.detached;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements HV0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f338379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f338380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f338381c;

    public /* synthetic */ a(b bVar, String str, int i12) {
        this.f338379a = i12;
        this.f338380b = bVar;
        this.f338381c = str;
    }

    @Override // HV0.b
    public final void close() {
        String str = this.f338381c;
        b bVar = this.f338380b;
        switch (this.f338379a) {
            case 0:
                int i12 = b.f338382d;
                bVar.b(str);
                break;
            default:
                int i13 = b.f338382d;
                bVar.b(str);
                break;
        }
    }
}
