package com.avito.android.select.variant;

import Y61.k;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.category_parameters.DisplayingImageParams;
import com.avito.android.util.C35837l2;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VariantItemImageConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/variant/c;", "Lcom/avito/android/select/variant/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* compiled from: VariantItemImageConverter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/Size;", "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Map<Size, ? extends Uri>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DisplayingImageParams f266854m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f266855n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DisplayingImageParams displayingImageParams, String str) {
            super(0);
            this.f266854m = displayingImageParams;
            this.f266855n = str;
        }

        @Override // Y41.a
        public final Map<Size, ? extends Uri> invoke() {
            c.this.getClass();
            return Collections.singletonMap(new Size(320, 480), c.b(this.f266854m.getBaseUrl(), null, this.f266855n));
        }
    }

    @Inject
    public c() {
    }

    public static Uri b(String str, String str2, String str3) {
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("id", str3);
        if (str2 != null && str2.length() != 0) {
            builderAppendQueryParameter.appendQueryParameter("size", str2);
        }
        return builderAppendQueryParameter.build();
    }

    @Override // com.avito.android.select.variant.b
    @k
    public final Image a(@k DisplayingImageParams displayingImageParams, @k String str) throws NumberFormatException {
        Map<Size, ? extends Uri> mapSingletonMap;
        if (O2.a(displayingImageParams.getSizeVariants())) {
            List<String> sizeVariants = displayingImageParams.getSizeVariants();
            ArrayList arrayList = new ArrayList();
            for (String str2 : sizeVariants) {
                Size sizeA = C35837l2.a(str2);
                Q q12 = sizeA != null ? new Q(sizeA, b(displayingImageParams.getBaseUrl(), str2, str)) : null;
                if (q12 != null) {
                    arrayList.add(q12);
                }
            }
            mapSingletonMap = O2.a(arrayList) ? P0.p(arrayList) : new a(displayingImageParams, str).invoke();
        } else {
            mapSingletonMap = Collections.singletonMap(new Size(320, 480), b(displayingImageParams.getBaseUrl(), null, str));
        }
        return new Image(mapSingletonMap);
    }
}
