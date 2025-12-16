package ru.cyberity.cbr.core.theme;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;

/* compiled from: CBRJsonCustomizationImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/theme/CBRJsonCustomizationImpl;", "Lru/cyberity/cbr/core/theme/CBRJsonCustomization;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/G0;", "loadResources", "(Landroid/content/Context;)V", "Lru/cyberity/cbr/core/theme/d;", "getTheme", "()Lru/cyberity/cbr/core/theme/d;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lru/cyberity/cbr/core/theme/d;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRJsonCustomizationImpl implements CBRJsonCustomization {

    @l
    private d theme;

    @Override // ru.cyberity.cbr.core.theme.CBRJsonCustomization
    public void loadResources(@k Context context) {
        d dVar = this.theme;
        if (dVar != null) {
            dVar.a(context);
        }
    }

    @Override // ru.cyberity.cbr.core.theme.CBRJsonCustomization
    @l
    public d getTheme() {
        return this.theme;
    }
}
