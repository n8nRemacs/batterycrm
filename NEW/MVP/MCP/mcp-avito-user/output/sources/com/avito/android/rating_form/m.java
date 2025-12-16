package com.avito.android.rating_form;

import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RatingFormFieldsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/m;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface m {

    /* compiled from: RatingFormFieldsStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    RatingFormAddValueType.StepsList.StepsListData.Step a();

    void b(@Y61.l Integer num);

    boolean c(@Y61.l StepIdentifier stepIdentifier, @Y61.k RatingFormAddValueType.FieldUpdate fieldUpdate);

    void d(@Y61.k List<RatingFormAddValueType.StepsList.StepsListData.Step> list);

    @Y61.k
    LinkedHashMap e();

    @Y61.l
    RatingFormField f(@Y61.k StepIdentifier stepIdentifier, @Y61.k FieldIdentifier fieldIdentifier, @Y61.l RatingFormField.ValueType valueType);

    void g(@Y61.k RatingFormAddValueType.HiddenFields.HiddenFieldsData hiddenFieldsData);

    void h(@Y61.k RatingFormField ratingFormField);

    void i(@Y61.l StepIdentifier stepIdentifier);

    @Y61.k
    List<RatingFormAddValueType.StepsList.StepsListData.Step> j();

    void k(@Y61.k FieldIdentifier fieldIdentifier);

    @Y61.l
    String l(@Y61.k StepIdentifier stepIdentifier);

    @Y61.l
    StepIdentifier m();

    @Y61.k
    ArrayList n();

    @Y61.l
    String o(@Y61.k StepIdentifier stepIdentifier);

    @Y61.l
    String p(@Y61.k StepIdentifier stepIdentifier);

    @Y61.l
    String q(@Y61.k StepIdentifier stepIdentifier);

    @Y61.l
    ArrayList r(@Y61.l StepIdentifier stepIdentifier);

    @Y61.l
    AttributedText s(@Y61.k StepIdentifier stepIdentifier);

    @Y61.k
    List<C34198a> t(@Y61.k StepIdentifier stepIdentifier);

    void u(@Y61.k StepIdentifier stepIdentifier, @Y61.k RatingFormAddValueType.RenderList.RenderListData renderListData, boolean z12, @Y61.l String str, boolean z13);

    void v(@Y61.k List<? extends List<String>> list);

    @Y61.l
    Integer w();

    void x(@Y61.k StepIdentifier stepIdentifier, @Y61.k RatingFormAddValueType.FieldsList.FieldsListData fieldsListData, boolean z12, @Y61.l String str, boolean z13);

    @Y61.l
    ArrayList y(@Y61.l StepIdentifier stepIdentifier);

    int z(@Y61.l StepIdentifier stepIdentifier);
}
