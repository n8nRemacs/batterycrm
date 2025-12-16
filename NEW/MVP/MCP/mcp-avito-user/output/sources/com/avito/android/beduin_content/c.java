package com.avito.android.beduin_content;

import Y61.k;
import com.avito.android.beduin_content.widget.SerpBeduinWidget;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.form.BeduinForm;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.l1;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinSerpItemConverter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin_content/c;", "Lcom/avito/android/serp/b;", "Lcom/avito/android/beduin_content/widget/SerpBeduinWidget;", "Lcom/avito/android/beduin_content/BeduinSerpItem;", "<init>", "()V", "a", "_avito_bx-content_widget_beduin-content_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.android.serp.b<SerpBeduinWidget, BeduinSerpItem> {

    /* compiled from: BeduinSerpItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin_content/c$a;", "", "<init>", "()V", "", "WIDGET_ID_PREFIX", "Ljava/lang/String;", "_avito_bx-content_widget_beduin-content_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.serp.b
    @k
    public final Class<? extends SerpBeduinWidget> a() {
        return SerpBeduinWidget.class;
    }

    @Override // com.avito.android.serp.b
    public final l1 b(SerpElement serpElement, String str, String str2, int i12) {
        SerpBeduinWidget serpBeduinWidget = (SerpBeduinWidget) serpElement;
        List<BeduinModel> freeForm = serpBeduinWidget.getFreeForm();
        if (freeForm == null || freeForm.isEmpty()) {
            return null;
        }
        String id2 = serpBeduinWidget.getId();
        if (id2 == null) {
            id2 = "BeduinSerpItem+" + UUID.randomUUID();
        }
        return new BeduinSerpItem(new BeduinForm(id2, serpBeduinWidget.getFreeForm()), null, serpBeduinWidget.getAnalytics(), serpBeduinWidget.getSettings(), 2, null);
    }
}
