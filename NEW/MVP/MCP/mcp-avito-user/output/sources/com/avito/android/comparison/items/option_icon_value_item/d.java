package com.avito.android.comparison.items.option_icon_value_item;

import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OptionIconValuePresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comparison/items/option_icon_value_item/d;", "LTV0/d;", "Lcom/avito/android/comparison/items/option_icon_value_item/f;", "Lcom/avito/android/comparison/items/option_icon_value_item/a;", "<init>", "()V", "a", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements TV0.d<f, com.avito.android.comparison.items.option_icon_value_item.a> {

    /* compiled from: OptionIconValuePresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/comparison/items/option_icon_value_item/d$a;", "", "<init>", "()V", "", "CHECK_ICON", "Ljava/lang/String;", "DASH_ICON", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        String str = ((com.avito.android.comparison.items.option_icon_value_item.a) aVar).f124047c;
        boolean zF2 = L.f(str, "dash");
        int i13 = R.drawable.ic_comparison_option_dash_24;
        if (!zF2 && L.f(str, "check")) {
            i13 = R.drawable.ic_comparison_option_check_24;
        }
        fVar.WY(i13);
    }
}
