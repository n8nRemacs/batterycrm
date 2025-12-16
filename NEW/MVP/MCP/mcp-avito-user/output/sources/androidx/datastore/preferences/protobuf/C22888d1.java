package androidx.datastore.preferences.protobuf;

/* compiled from: RawMessageInfo.java */
/* renamed from: androidx.datastore.preferences.protobuf.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22888d1 implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public final F0 f45814a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45815b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f45816c;

    /* renamed from: d, reason: collision with root package name */
    public final int f45817d;

    public C22888d1(F0 f02, String str, Object[] objArr) {
        this.f45814a = f02;
        this.f45815b = str;
        this.f45816c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f45817d = cCharAt;
            return;
        }
        int i12 = cCharAt & 8191;
        int i13 = 1;
        int i14 = 13;
        while (true) {
            int i15 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.f45817d = i12 | (cCharAt2 << i14);
                return;
            } else {
                i12 |= (cCharAt2 & 8191) << i14;
                i14 += 13;
                i13 = i15;
            }
        }
    }

    public final Object[] a() {
        return this.f45816c;
    }

    public final String b() {
        return this.f45815b;
    }

    @Override // androidx.datastore.preferences.protobuf.D0
    public final F0 getDefaultInstance() {
        return this.f45814a;
    }

    @Override // androidx.datastore.preferences.protobuf.D0
    public final ProtoSyntax getSyntax() {
        return (this.f45817d & 1) == 1 ? ProtoSyntax.f45735b : ProtoSyntax.f45736c;
    }

    @Override // androidx.datastore.preferences.protobuf.D0
    public final boolean isMessageSetWireFormat() {
        return (this.f45817d & 2) == 2;
    }
}
