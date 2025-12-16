package com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import zD0.C50441a;
import zD0.C50442b;
import zD0.C50443c;
import zD0.C50444d;

/* compiled from: ConstructorConfigureVerticalConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/vertical/viewmodel/b;", "Lcom/avito/android/tariff_lf_constructor/configure/vertical/viewmodel/a;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    public static com.avito.android.tariff_lf_constructor.configure.vertical.items.content.a b(C50441a c50441a, int i12, String str, boolean z12) {
        return new com.avito.android.tariff_lf_constructor.configure.vertical.items.content.a(c50441a.getDeeplink(), c50441a.getImage(), str + i12, c50441a.getTitle(), c50441a.getDescription(), z12);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.a
    @Y61.k
    public final ArrayList a(@Y61.k C50442b c50442b) {
        ArrayList arrayListE0 = C42745f0.e0(new com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.a("header_item", c50442b.getTitle(), c50442b.getDescription()));
        C50443c selector = c50442b.getSelector();
        if (selector != null) {
            arrayListE0.add(new com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.a(selector.getName(), selector.getAvatar(), selector.getDeeplink()));
        }
        List<C50441a> listE = c50442b.e();
        ArrayList arrayList = new ArrayList(C42745f0.q(listE, 10));
        int i12 = 0;
        for (Object obj : listE) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(b((C50441a) obj, i12, "content_item", true));
            i12 = i13;
        }
        arrayListE0.addAll(arrayList);
        C50444d unavailableVerticals = c50442b.getUnavailableVerticals();
        if (unavailableVerticals != null) {
            AttributedText description = unavailableVerticals.getDescription();
            if (description != null) {
                arrayListE0.add(new com.avito.android.tariff_lf_constructor.configure.vertical.items.text.a(description));
            }
            List<C50441a> listB = unavailableVerticals.b();
            if (listB != null) {
                List<C50441a> list = listB;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                int i14 = 0;
                for (Object obj2 : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    arrayList2.add(b((C50441a) obj2, i14, "extra_content_item", false));
                    i14 = i15;
                }
                arrayListE0.addAll(arrayList2);
            }
        }
        return arrayListE0;
    }
}
