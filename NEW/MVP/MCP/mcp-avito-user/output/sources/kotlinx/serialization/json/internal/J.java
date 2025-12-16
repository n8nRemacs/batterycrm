package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: JsonNamesMap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "", "invoke", "()[Ljava/lang/String;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class J extends kotlin.jvm.internal.N implements Y41.a<String[]> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f413012l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.serialization.json.z f413013m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(SerialDescriptor serialDescriptor, kotlinx.serialization.json.z zVar) {
        super(0);
        this.f413012l = serialDescriptor;
        this.f413013m = zVar;
    }

    @Override // Y41.a
    public final String[] invoke() {
        SerialDescriptor serialDescriptor = this.f413012l;
        int iC2 = serialDescriptor.c();
        String[] strArr = new String[iC2];
        for (int i12 = 0; i12 < iC2; i12++) {
            strArr[i12] = this.f413013m.a(serialDescriptor.d(i12));
        }
        return strArr;
    }
}
