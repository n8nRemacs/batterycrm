package com.avito.android.select.sectioned_multiselect.container.di;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import aq0.InterfaceC23653b;
import com.avito.android.di.B;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.select.sectioned_multiselect.container.SectionedMultiselectContainerFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectContainerComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/di/c;", "", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: SectionedMultiselectContainerComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/di/c$a;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        c a(@h31.b @k @com.avito.android.select.sectioned_multiselect.a String str, @b @h31.b @k Context context, @h31.b @k Resources resources, @h31.b @k SectionedMultiselectContainerFragment sectionedMultiselectContainerFragment, @h31.b @k ActivityC22955m activityC22955m, @h31.b @l SearchParams searchParams, @h31.b boolean z12, @k InterfaceC23653b interfaceC23653b);
    }

    void a(@k SectionedMultiselectContainerFragment sectionedMultiselectContainerFragment);
}
