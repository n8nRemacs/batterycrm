package LV;

import Y61.k;
import android.content.Context;
import com.avito.android.util.C35835l0;
import j.InterfaceC42150f;
import j.f0;
import kotlin.Metadata;

/* compiled from: UdfStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"LLV/c;", "", "Style", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface c<Style> {

    /* compiled from: UdfStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @k
        public static <Style> Style a(@k c<Style> cVar, @k Context context, @InterfaceC42150f int i12) {
            return (Style) cVar.a(C35835l0.j(i12, context), context);
        }
    }

    @k
    Object a(@f0 int i12, @k Context context);
}
