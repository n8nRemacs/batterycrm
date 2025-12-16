package com.google.protobuf;

/* compiled from: RawMessageInfo.java */
@InterfaceC37706w
/* loaded from: classes7.dex */
final class Q0 implements InterfaceC37703u0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC37707w0 f362735a;

    /* renamed from: b, reason: collision with root package name */
    public final String f362736b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f362737c;

    /* renamed from: d, reason: collision with root package name */
    public final int f362738d;

    public Q0(InterfaceC37707w0 interfaceC37707w0, String str, Object[] objArr) {
        this.f362735a = interfaceC37707w0;
        this.f362736b = str;
        this.f362737c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f362738d = cCharAt;
            return;
        }
        int i12 = cCharAt & 8191;
        int i13 = 13;
        int i14 = 1;
        while (true) {
            int i15 = i14 + 1;
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 55296) {
                this.f362738d = i12 | (cCharAt2 << i13);
                return;
            } else {
                i12 |= (cCharAt2 & 8191) << i13;
                i13 += 13;
                i14 = i15;
            }
        }
    }

    public final Object[] a() {
        return this.f362737c;
    }

    public final String b() {
        return this.f362736b;
    }

    @Override // com.google.protobuf.InterfaceC37703u0
    public final InterfaceC37707w0 getDefaultInstance() {
        return this.f362735a;
    }

    @Override // com.google.protobuf.InterfaceC37703u0
    public final ProtoSyntax getSyntax() {
        return (this.f362738d & 1) == 1 ? ProtoSyntax.f362731b : ProtoSyntax.f362732c;
    }

    @Override // com.google.protobuf.InterfaceC37703u0
    public final boolean isMessageSetWireFormat() {
        return (this.f362738d & 2) == 2;
    }
}
