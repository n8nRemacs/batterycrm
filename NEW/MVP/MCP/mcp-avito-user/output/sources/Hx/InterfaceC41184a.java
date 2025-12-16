package hx;

import Y61.k;
import Y61.l;
import android.content.Intent;
import kotlin.Metadata;

/* compiled from: DevelopmentsCatalogIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhx/a;", "", "_avito_developments-catalog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC41184a {

    /* compiled from: DevelopmentsCatalogIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hx.a$a, reason: collision with other inner class name */
    public static final class C11358a {
        public static /* synthetic */ Intent a(InterfaceC41184a interfaceC41184a, Double d12, Double d13, int i12) {
            if ((i12 & 1) != 0) {
                d12 = null;
            }
            if ((i12 & 2) != 0) {
                d13 = null;
            }
            return interfaceC41184a.a(d12, d13, (i12 & 8) != 0);
        }
    }

    @k
    Intent a(@l Double d12, @l Double d13, boolean z12);
}
