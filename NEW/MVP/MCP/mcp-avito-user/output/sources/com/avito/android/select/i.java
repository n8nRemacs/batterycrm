package com.avito.android.select;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SelectDialogLogoStorageInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/i;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface i {
    @Y61.l
    Map<String, Image> a(@Y61.k String str);

    void b(@Y61.k SectionedMultiselectParameter sectionedMultiselectParameter);

    void c(@Y61.k SectionedMultiselectParameter sectionedMultiselectParameter);

    @Y61.l
    Map<String, UniversalImage> d(@Y61.k String str);

    void e(@Y61.k SelectParameter selectParameter);

    @Y61.l
    Map<String, UniversalImage> f(@Y61.k String str);
}
