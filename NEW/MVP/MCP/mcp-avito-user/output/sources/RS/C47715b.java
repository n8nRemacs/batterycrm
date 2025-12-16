package rs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiCpxPromoSearchLocationsRequest.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lrs/b;", "", "", "context", SingleLineInputModel.STYLE_SEARCH, "", "", "selectedLocationIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "getSearch", "Ljava/util/List;", "getSelectedLocationIds", "()Ljava/util/List;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47715b {

    @c("context")
    @k
    private final String context;

    @c(SingleLineInputModel.STYLE_SEARCH)
    @l
    private final String search;

    @c("selectedLocationIds")
    @k
    private final List<Long> selectedLocationIds;

    public C47715b(@k String str, @l String str2, @k List<Long> list) {
        this.context = str;
        this.search = str2;
        this.selectedLocationIds = list;
    }
}
