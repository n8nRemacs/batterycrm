package com.avito.android.beduin_shared.model.progress_overlay;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: BeduinProgressOverlay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/model/progress_overlay/a;", "Lkd0/a;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends C42670a {

    /* compiled from: BeduinProgressOverlay.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin_shared.model.progress_overlay.a$a, reason: collision with other inner class name */
    public static final class C3146a extends N implements l<ContentPlaceholder, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.a f105314l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3146a(b.a aVar) {
            super(1);
            this.f105314l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(ContentPlaceholder contentPlaceholder) {
            ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
            b.a aVar = this.f105314l;
            contentPlaceholder2.setImageDrawable(aVar.f105317c);
            contentPlaceholder2.setTitle(aVar.f105315a);
            contentPlaceholder2.setSubtitle(aVar.f105316b);
            b.a.C3147a c3147a = aVar.f105318d;
            contentPlaceholder2.setButtonTitle(c3147a != null ? c3147a.f105320a : null);
            contentPlaceholder2.setButtonOnClickListener(c3147a != null ? c3147a.f105321b : null);
            return G0.f406611a;
        }
    }

    public /* synthetic */ a(ViewGroup viewGroup, Y41.a aVar, int i12, C42822w c42822w) {
        this(viewGroup, (i12 & 2) != 0 ? null : aVar);
    }

    public final void e(@k b.a aVar) {
        c(aVar.f105319e, new C3146a(aVar));
    }

    public a(@k ViewGroup viewGroup, @Y61.l Y41.a<? extends View> aVar) {
        super(viewGroup, aVar, 0, 4, null);
    }
}
