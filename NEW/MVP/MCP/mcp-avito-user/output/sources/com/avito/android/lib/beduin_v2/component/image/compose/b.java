package com.avito.android.lib.beduin_v2.component.image.compose;

import android.net.Uri;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.graphics.painter.e;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.beduin.v2.avito.component.image.state.Scale;
import com.avito.beduin.v2.avito.component.image.state.q;
import com.avito.beduin.v2.avito.component.image.state.s;
import com.avito.beduin.v2.avito.component.image.state.u;
import com.avito.beduin.v2.render.compose.C36345b;
import com.avito.beduin.v2.theme.k;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ImageComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2_renderer-compose_component_image"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* compiled from: ImageComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175631a;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.f334401f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.f334403h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Scale.f334402g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Scale.f334404i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f175631a = iArr;
        }
    }

    public static final Image a(Map<q.b, q.c> map) {
        Uri uri;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<q.b, q.c> entry : map.entrySet()) {
            q.b key = entry.getKey();
            q.c value = entry.getValue();
            Size size = new Size(key.f334442a, key.f334443b);
            if (value == null || (uri = Uri.parse(value.f334444a)) == null) {
                uri = Uri.EMPTY;
            }
            arrayList.add(new Q(size, uri));
        }
        return new Image(P0.p(arrayList));
    }

    @InterfaceC22132o
    public static final e b(s sVar, A a12) {
        a12.C(1999697555);
        k kVar = (k) a12.o(C36345b.f338051b);
        e eVarA = null;
        if (sVar instanceof u) {
            u uVar = (u) sVar;
            int iIntValue = ((Integer) kVar.f338363a.c(uVar.f334451a, uVar.f334452b)).intValue();
            if (iIntValue != 0) {
                eVarA = u0.e.a(iIntValue, 0, a12);
            }
        }
        a12.h();
        return eVarA;
    }
}
