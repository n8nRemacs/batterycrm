package com.avito.android.publish.params_suggest;

import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ParamsSuggestionsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class r extends N implements Y41.l<CategoryPublishStep, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final r f238240l = new r();

    public r() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(CategoryPublishStep categoryPublishStep) {
        CategoryPublishStep categoryPublishStep2 = categoryPublishStep;
        return "(" + categoryPublishStep2.getId() + ", " + categoryPublishStep2.getType() + ' ' + categoryPublishStep2.getSubtype() + ')';
    }
}
