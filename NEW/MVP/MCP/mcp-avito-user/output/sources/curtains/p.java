package curtains;

import android.content.res.Resources;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Windows.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"curtains_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f393030a = C42727D.b(LazyThreadSafetyMode.f406616d, a.f393031l);

    /* compiled from: Windows.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class a extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f393031l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            try {
                return Resources.getSystem().getString(Resources.getSystem().getIdentifier("tooltip_popup_title", "string", "android"));
            } catch (Resources.NotFoundException unused) {
                return "Tooltip";
            }
        }
    }
}
