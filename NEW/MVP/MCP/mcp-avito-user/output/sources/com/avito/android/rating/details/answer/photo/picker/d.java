package com.avito.android.rating.details.answer.photo.picker;

import Mg0.InterfaceC14487a;
import Y61.k;
import com.avito.android.remote.model.RatingsImageUploadResult;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.o;
import n80.InterfaceC44212a;

/* compiled from: RatingAnswerPhotoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/picker/d;", "Ln80/a;", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements InterfaceC44212a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14487a f246776a;

    /* compiled from: RatingAnswerPhotoUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/picker/d$a;", "", "<init>", "()V", "", "ANSWER_IMAGE_TYPE", "Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingAnswerPhotoUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/RatingsImageUploadResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f246777b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((RatingsImageUploadResult) obj).getFileId();
        }
    }

    static {
        new a(null);
    }

    public d(@k InterfaceC14487a interfaceC14487a) {
        this.f246776a = interfaceC14487a;
    }

    @Override // n80.InterfaceC44212a
    @k
    public final I a(@k File file, @k String str) {
        return g1.a(this.f246776a.n(com.avito.http.b.a(file, 3), "answer")).r(b.f246777b);
    }
}
