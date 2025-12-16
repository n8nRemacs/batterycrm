package com.avito.android.beduin.common.component.emotions;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinEmotionsComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<BeduinEmotionsChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EmotionRatingBar f101161l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.emotions.a f101162m;

    /* compiled from: BeduinEmotionsComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BeduinEmotionsChange.values().length];
            try {
                iArr[BeduinEmotionsChange.f101118c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinEmotionsChange.f101119d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EmotionRatingBar emotionRatingBar, com.avito.android.beduin.common.component.emotions.a aVar) {
        super(1);
        this.f101161l = emotionRatingBar;
        this.f101162m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(BeduinEmotionsChange beduinEmotionsChange) {
        int iOrdinal = beduinEmotionsChange.ordinal();
        com.avito.android.beduin.common.component.emotions.a aVar = this.f101162m;
        EmotionRatingBar emotionRatingBar = this.f101161l;
        if (iOrdinal == 0) {
            Boolean boolIsEnabled = aVar.f101156e.isEnabled();
            emotionRatingBar.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        } else if (iOrdinal == 1) {
            emotionRatingBar.setSelectedId(aVar.f101156e.getSelectedId());
        }
        return G0.f406611a;
    }
}
