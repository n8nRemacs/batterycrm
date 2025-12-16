package com.avito.android.publish.params_suggest;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ParamsSuggestionsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.l<P2<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParamsSuggestionsFragment f238211l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ParamsSuggestionsFragment paramsSuggestionsFragment) {
        super(1);
        this.f238211l = paramsSuggestionsFragment;
    }

    @Override // Y41.l
    public final G0 invoke(P2<?> p22) {
        if (L.f(p22, P2.c.f318721a)) {
            com.avito.android.progress_overlay.l lVar = this.f238211l.f238179j0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
        }
        return G0.f406611a;
    }
}
