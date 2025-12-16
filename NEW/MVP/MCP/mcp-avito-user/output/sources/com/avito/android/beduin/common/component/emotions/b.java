package com.avito.android.beduin.common.component.emotions;

import Y61.k;
import com.avito.android.beduin.common.component.emotions.EmotionRatingBar;
import com.avito.android.beduin.common.form.transforms.SelectedIdTransform;
import com.avito.android.beduin.common.utils.C28806b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.utils.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinEmotionsComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/b;", "Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar$a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements EmotionRatingBar.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f101160a;

    public b(a aVar) {
        this.f101160a = aVar;
    }

    @Override // com.avito.android.beduin.common.component.emotions.EmotionRatingBar.a
    public final void a(@k String str) {
        a aVar = this.f101160a;
        BeduinEmotionsModel beduinEmotionsModel = aVar.f101156e;
        if (L.f(beduinEmotionsModel.getSelectedId(), str)) {
            return;
        }
        j.a(aVar.f101158g, beduinEmotionsModel.getF100853b(), new SelectedIdTransform(str));
        List<BeduinAction> onChangeSelectedActions = beduinEmotionsModel.getOnChangeSelectedActions();
        if (onChangeSelectedActions != null) {
            C28806b.a(aVar.f101157f, onChangeSelectedActions);
        }
    }
}
