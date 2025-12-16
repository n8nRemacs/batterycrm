package com.avito.android.similar_adverts;

import com.avito.android.remote.model.section.SectionResponse;
import kotlin.Metadata;

/* compiled from: SimilarAdvertsInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "it", "Lcom/avito/android/remote/model/section/SectionResponse;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class e<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final e<T, R> f283925b = new e<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((SectionResponse) obj).getSections();
    }
}
