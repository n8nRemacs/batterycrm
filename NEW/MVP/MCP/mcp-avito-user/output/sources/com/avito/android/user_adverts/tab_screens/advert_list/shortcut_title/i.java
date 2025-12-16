package com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title;

import com.avito.android.lib.design.toggle.State;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.user_adverts.model.UserAdvertsGroupSelectedState;
import com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ShortcutTitleItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/toggle/State;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/toggle/State;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements Y41.l<State, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f314786l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f314787m;

    /* compiled from: ShortcutTitleItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State state = State.f181147b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, d dVar) {
        super(1);
        this.f314786l = hVar;
        this.f314787m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(State state) {
        int iOrdinal = state.ordinal();
        UserAdvertsGroupSelectedState userAdvertsGroupSelectedState = iOrdinal != 0 ? iOrdinal != 1 ? null : UserAdvertsGroupSelectedState.f312189d : UserAdvertsGroupSelectedState.f312187b;
        if (userAdvertsGroupSelectedState != null) {
            this.f314786l.f314784b.b4(new a.C9734a(this.f314787m.f314769c, userAdvertsGroupSelectedState));
        }
        return G0.f406611a;
    }
}
