package wZ;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;

/* compiled from: MnzUniversalImage.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m {
    @Y61.l
    public static final l a(@Y61.k UniversalImage universalImage) {
        Image image = universalImage.getImage();
        if (image != null) {
            return new l(image, universalImage.getImageDark());
        }
        return null;
    }
}
