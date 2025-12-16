package Y80;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoButton;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.SearchPositionBottomButtonState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BottomStateConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY80/a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<String, G0> f19341a;

    /* compiled from: BottomStateConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Y80.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1369a {
        static {
            int[] iArr = new int[PositionInfoButton.Style.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PositionInfoButton.Style style = PositionInfoButton.Style.f220427b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k l<? super String, G0> lVar) {
        this.f19341a = lVar;
    }

    public final SearchPositionBottomButtonState a(W80.c cVar) {
        SearchPositionBottomButtonState.ButtonStyle buttonStyle;
        PositionInfoButton positionInfoButton = cVar.f17778b;
        String str = positionInfoButton.f220424a;
        int iOrdinal = positionInfoButton.f220426c.ordinal();
        if (iOrdinal == 0) {
            buttonStyle = SearchPositionBottomButtonState.ButtonStyle.f221284b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            buttonStyle = SearchPositionBottomButtonState.ButtonStyle.f221285c;
        }
        return new SearchPositionBottomButtonState(cVar.f17777a, str, buttonStyle, this.f19341a);
    }
}
