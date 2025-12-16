package kotlinx.serialization.json.internal;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.text.C43047d;

/* compiled from: JvmJsonStreams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/A;", "Lkotlinx/serialization/json/internal/y;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A implements InterfaceC43473y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43465p f412997a;

    public A(@Y61.k InputStream inputStream) {
        this.f412997a = new C43465p(inputStream, C43047d.f410589b);
    }

    @Override // kotlinx.serialization.json.internal.InterfaceC43473y
    public final int a(@Y61.k char[] cArr, int i12, int i13) {
        return this.f412997a.a(cArr, i12, i13);
    }
}
