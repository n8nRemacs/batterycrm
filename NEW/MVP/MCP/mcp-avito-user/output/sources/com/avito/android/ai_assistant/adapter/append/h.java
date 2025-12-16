package com.avito.android.ai_assistant.adapter.append;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppendItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/append/h;", "Lcom/avito/android/ai_assistant/adapter/append/g;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f88738b;

    /* compiled from: AppendItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AppendState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AppendState appendState = AppendState.f88727b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public h(@Y61.k f fVar) {
        this.f88738b = fVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        int iOrdinal = ((b) aVar).f88733c.ordinal();
        if (iOrdinal == 0) {
            this.f88738b.b();
            kVar.YT();
        } else {
            if (iOrdinal != 1) {
                return;
            }
            kVar.dW(new i(this));
        }
    }
}
