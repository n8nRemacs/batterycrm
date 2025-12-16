package com.avito.android.select.sectioned_multiselect.core.di;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import aq0.InterfaceC23653b;
import com.avito.android.di.B;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.select.sectioned_multiselect.core.SectionedMultiselectCoreFragment;
import cv.InterfaceC39417a;
import h31.d;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectDialogComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/core/di/c;", "", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: SectionedMultiselectDialogComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/core/di/c$a;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC39417a interfaceC39417a);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        c build();

        @h31.b
        @Y61.k
        a c(@Y61.k @com.avito.android.select.sectioned_multiselect.a String str);

        @Y61.k
        a d(@Y61.k InterfaceC23653b interfaceC23653b);

        @h31.b
        @Y61.k
        a e(@Y61.l InterfaceC19588c<? super InterfaceC19587b> interfaceC19588c);

        @h31.b
        @Y61.k
        a f(@n boolean z12);

        @h31.b
        @Y61.k
        a g(@Y61.k ActivityC22955m activityC22955m);

        @h31.b
        @Y61.k
        a h(@Y61.k List<SectionedMultiselectParameter.Value> list);

        @h31.b
        @Y61.k
        a o(@Y61.k SearchParams searchParams);

        @h31.b
        @Y61.k
        a q(@Y61.l Bundle bundle);
    }

    void a(@Y61.k SectionedMultiselectCoreFragment sectionedMultiselectCoreFragment);
}
