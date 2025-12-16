package com.avito.android.rating.details.answer.photo.picker;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.C22026a;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import i.AbstractC41201a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAnswerPhotoPickerActivityResultContract.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/picker/b;", "Li/a;", "Lcom/avito/android/rating/details/answer/photo/picker/b$a;", "", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends AbstractC41201a<a, Integer> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PhotoPickerIntentFactory f246772b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final s f246773c;

    /* compiled from: RatingAnswerPhotoPickerActivityResultContract.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/picker/b$a;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f246774a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f246775b;

        public a(@k String str, @l String str2) {
            this.f246774a = str;
            this.f246775b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f246774a, aVar.f246774a) && L.f(this.f246775b, aVar.f246775b);
        }

        public final int hashCode() {
            int iHashCode = this.f246774a.hashCode() * 31;
            String str = this.f246775b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Params(operationId=");
            sb2.append(this.f246774a);
            sb2.append(", selectedPhotoId=");
            return C22026a.c(sb2, this.f246775b, ')');
        }
    }

    @Inject
    public b(@k PhotoPickerIntentFactory photoPickerIntentFactory, @k s sVar) {
        this.f246772b = photoPickerIntentFactory;
        this.f246773c = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, a aVar) {
        a aVar2 = aVar;
        int iC2 = this.f246773c.C();
        PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd modeAdd = new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, 0 == true ? 1 : 0);
        return PhotoPickerIntentFactory.a.a(this.f246772b, context, aVar2.f246774a, "ratings answers images", 0, iC2, aVar2.f246775b, null, modeAdd, false, 328);
    }

    @Override // i.AbstractC41201a
    public final Integer parseResult(int i12, Intent intent) {
        return Integer.valueOf(i12);
    }
}
