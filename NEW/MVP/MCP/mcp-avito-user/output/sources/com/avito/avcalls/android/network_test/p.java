package com.avito.avcalls.android.network_test;

import androidx.compose.ui.platform.C22491k0;
import com.avito.avcalls.android.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.C42837c;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.x1;

/* compiled from: NetworkTestRunner.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/android/network_test/p;", "", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f331827c = C42745f0.h0(new C42837c('A', 'Z'), C42745f0.f0(new C42837c('0', '1'), new C42837c('a', 'z')));

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a.e f331828a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.bxcontent.mvi.entity.f f331829b;

    /* compiled from: NetworkTestRunner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/network_test/p$a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    /* compiled from: NetworkTestRunner.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/avcalls/android/network_test/p$b;", "", "<init>", "()V", "", "", "charPool", "Ljava/util/List;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.network_test.p$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    public p(@Y61.k a.e eVar, @Y61.l com.avito.android.bxcontent.mvi.entity.f fVar) {
        this.f331828a = eVar;
        this.f331829b = fVar;
    }

    @Y61.k
    public final o a(@Y61.k com.avito.android.iac_avcalls.impl_module.network_test.f fVar) {
        String strO = C42745f0.O(new kotlin.ranges.l(1, 16, 1), "", null, null, q.f331830l, 30);
        String strA = C22491k0.a(')', "NetworkTestRunner(", strO);
        C43238h c43238hA = U.a(x1.a("NetworkTest_".concat(strO)).plus(new r(N.f410714t2, fVar, strO)));
        C43259k.d(c43238hA, null, null, new s(this, strA, strO, c43238hA, fVar, null), 3);
        return new o(c43238hA, 0);
    }
}
