package com.avito.android.extended_profile;

import androidx.view.N0;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import kotlin.AbstractC40048c;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;

/* compiled from: ExtendedProfileMviViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class Y extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h31.e<n.a> f149382l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X f149383m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(h31.e<n.a> eVar, X x12) {
        super(0);
        this.f149382l = eVar;
        this.f149383m = x12;
    }

    @Override // Y41.a
    public final com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
        return this.f149382l.get().a(N0.a(this.f149383m));
    }
}
