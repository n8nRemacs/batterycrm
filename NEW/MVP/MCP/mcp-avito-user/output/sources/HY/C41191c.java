package hy;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DaysPickerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhy/c;", "Lhy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hy.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C41191c implements InterfaceC41190b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<Integer> f398313a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Integer> f398314b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<List<Integer>, G0> f398315c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C41194f f398316d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Boolean[] f398317e;

    /* JADX WARN: Multi-variable type inference failed */
    public C41191c(@k List<Integer> list, @k List<Integer> list2, @k l<? super List<Integer>, G0> lVar) {
        this.f398313a = list;
        this.f398314b = list2;
        this.f398315c = lVar;
        Boolean[] boolArr = new Boolean[7];
        for (int i12 = 0; i12 < 7; i12++) {
            boolArr[i12] = Boolean.FALSE;
        }
        this.f398317e = boolArr;
    }
}
