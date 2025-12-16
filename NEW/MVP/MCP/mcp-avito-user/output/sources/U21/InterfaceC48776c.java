package u21;

import Y61.k;
import android.view.View;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.json.expressions.e;
import com.yandex.div2.H;
import kotlin.Metadata;

/* compiled from: DivExtensionHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lu21/c;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: u21.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC48776c {
    void bindView(@k C38029k c38029k, @k View view, @k H h12);

    boolean matches(@k H h12);

    void unbindView(@k C38029k c38029k, @k View view, @k H h12);

    default void preprocess(@k H h12, @k e eVar) {
    }

    default void beforeBindView(@k C38029k c38029k, @k View view, @k H h12) {
    }
}
