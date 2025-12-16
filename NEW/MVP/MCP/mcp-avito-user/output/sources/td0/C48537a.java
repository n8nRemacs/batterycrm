package tD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_lf_constructor.configure.remote.model.level.ConfigureLevelFeature;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ConfigureLevel.kt */
@P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LtD0/a;", "", "", "title", "description", "Lcom/avito/android/remote/model/Image;", "image", "", "Lcom/avito/android/tariff_lf_constructor/configure/remote/model/level/ConfigureLevelFeature;", "features", "Lcom/avito/android/remote/model/text/AttributedText;", "actionLink", "price", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "c", "Lcom/avito/android/remote/model/Image;", "e", "()Lcom/avito/android/remote/model/Image;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "Lcom/avito/android/remote/model/ButtonAction;", "b", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tD0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48537a {

    @c("actionLink")
    @l
    private final AttributedText actionLink;

    @c("button")
    @k
    private final ButtonAction button;

    @c("description")
    @k
    private final String description;

    @c("features")
    @k
    private final List<ConfigureLevelFeature> features;

    @c("images")
    @k
    private final Image image;

    @c("price")
    @k
    private final String price;

    @c("title")
    @k
    private final String title;

    public C48537a(@k String str, @k String str2, @k Image image, @k List<ConfigureLevelFeature> list, @l AttributedText attributedText, @k String str3, @k ButtonAction buttonAction) {
        this.title = str;
        this.description = str2;
        this.image = image;
        this.features = list;
        this.actionLink = attributedText;
        this.price = str3;
        this.button = buttonAction;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getActionLink() {
        return this.actionLink;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    public final List<ConfigureLevelFeature> d() {
        return this.features;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
