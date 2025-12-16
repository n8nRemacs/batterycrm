package com.avito.android.search.filter.converter;

import androidx.compose.ui.platform.C22491k0;
import com.avito.android.R;
import com.avito.android.search.filter.converter.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: CategoryParameterStringValueConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/c$b;", "it", "", "invoke", "(Lcom/avito/android/search/filter/converter/c$b;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.l<c.b, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f262977l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar) {
        super(1);
        this.f262977l = cVar;
    }

    @Override // Y41.l
    public final CharSequence invoke(c.b bVar) {
        c.b bVar2 = bVar;
        List<String> list = bVar2.f262896b;
        if (bVar2.f262897c != list.size() && !list.isEmpty()) {
            return C42745f0.O(list, ", ", null, null, null, 62);
        }
        StringBuilder sbB = C22491k0.b(this.f262977l.f262893d.getString(R.string.search_filter_filters_sectioned_multiselect_title_prefix), ' ');
        sbB.append(bVar2.f262895a);
        return sbB.toString();
    }
}
