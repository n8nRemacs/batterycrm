package com.avito.android.bxcontent.beduin_v2.di;

import C11.b;
import Y41.l;
import Y41.p;
import Y61.k;
import cU.q;
import com.avito.android.advertising.loaders.beduin.G;
import com.avito.android.advertising.loaders.beduin.container.a;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.beduin_v2.feature.di.C0;
import com.avito.android.serp.adapter.S;
import com.avito.android.serp.i;
import com.avito.android.snippet.video.m;
import io.reactivex.rxjava3.core.I;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BxContentBeduinLocalComponents.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/di/a;", "Lcom/avito/android/lib/beduin_v2/feature/di/C0;", "LcU/q;", "a", "b", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a extends C0, q {

    /* compiled from: BxContentBeduinLocalComponents.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/di/a$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.beduin_v2.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3269a {
        @k
        a a(@h31.b @k l<? super InterfaceC29127b, G0> lVar, @h31.b @k l<? super String, Boolean> lVar2, @h31.b @k l<? super S, G0> lVar3, @h31.b @k p<? super String, ? super Boolean, ? extends I<Boolean>> pVar, @h31.b @k Y41.a<com.avito.konveyor.a> aVar, @h31.b @k Y41.a<com.avito.android.bxcontent.mvi.entity.l> aVar2, @h31.b @k Y41.a<? extends i> aVar3, @h31.b @k Y41.a<G> aVar4, @h31.b @k Y41.a<m> aVar5);
    }

    /* compiled from: BxContentBeduinLocalComponents.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/di/a$b;", "Lcom/avito/android/di/h;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h {
        @k
        InterfaceC3269a i9();
    }

    @k
    a.C2610a a();

    @k
    com.avito.android.bxcontent.beduin_v2.wrapper.cell.b e();

    @k
    com.avito.android.snippet.video.l f();

    @k
    com.avito.android.bxcontent.beduin_v2.wrapper.c k();
}
