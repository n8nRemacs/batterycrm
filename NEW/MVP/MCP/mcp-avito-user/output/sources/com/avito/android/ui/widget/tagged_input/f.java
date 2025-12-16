package com.avito.android.ui.widget.tagged_input;

import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.ui.widget.tagged_input.TagItem;
import com.avito.android.ui.widget.tagged_input.e;
import jG0.C42253a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TagsConsumerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/f;", "Lcom/avito/android/ui/widget/tagged_input/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final jG0.c f304707b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public m f304708c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Object f304709d;

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC23040h0 {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.avito.android.ui.widget.tagged_input.e$a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v5, types: [com.avito.android.ui.widget.tagged_input.e$a, java.lang.Object] */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            InterfaceC28464o c42253a;
            if (t12 != 0) {
                TagItem tagItem = (TagItem) t12;
                TagItem.Value value = tagItem.f304694c;
                boolean z12 = value.f304702c;
                f fVar = f.this;
                String str = value.f304701b;
                if (z12) {
                    ?? r12 = fVar.f304709d;
                    if (r12 != 0) {
                        r12.setText(str);
                    }
                } else {
                    ?? r13 = fVar.f304709d;
                    if (r13 != 0) {
                        r13.B50(str);
                    }
                }
                jG0.c cVar = fVar.f304707b;
                cVar.getClass();
                SuggestAnalyticsEvent suggestAnalyticsEvent = tagItem.f304696e;
                if (suggestAnalyticsEvent != null) {
                    com.avito.android.analytics.events.d.f90154c.getClass();
                    c42253a = new com.avito.android.analytics.events.d(suggestAnalyticsEvent.getId(), suggestAnalyticsEvent.getVersion(), suggestAnalyticsEvent.getParameters(), null);
                } else {
                    c42253a = new C42253a(cVar.f405535b, tagItem.f304693b);
                }
                cVar.f405534a.c(c42253a);
            }
        }
    }

    public f(@Y61.k jG0.c cVar) {
        this.f304707b = cVar;
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void No(@Y61.k String str, @Y61.k InterfaceC22983P interfaceC22983P) {
        m mVar = this.f304708c;
        if (mVar == null) {
            return;
        }
        mVar.f304731E.b(str).removeObservers(interfaceC22983P);
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void rv() {
        this.f304709d = null;
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void wE(@Y61.k e.a aVar) {
        this.f304709d = aVar;
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void yh(@Y61.k String str, @Y61.k m mVar, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f304708c = mVar;
        mVar.f304731E.b(str).observe(interfaceC22983P, new a());
    }
}
