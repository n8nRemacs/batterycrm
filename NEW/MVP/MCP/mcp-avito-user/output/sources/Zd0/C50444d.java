package zD0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: UnavailableVerticals.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LzD0/d;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "LzD0/a;", "verticals", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zD0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50444d {

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("verticals")
    @l
    private final List<C50441a> verticals;

    public C50444d(@l AttributedText attributedText, @l List<C50441a> list) {
        this.description = attributedText;
        this.verticals = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final List<C50441a> b() {
        return this.verticals;
    }
}
