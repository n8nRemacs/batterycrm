package com.avito.android.beduin.ui.screen.fragment.tab;

import Y61.k;
import android.content.Context;
import com.avito.android.beduin.ui.screen.model.BeduinTabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTabAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tab/b;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f104297a;

    /* compiled from: BeduinTabAdapterFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104298a;

        static {
            int[] iArr = new int[BeduinTabLayout.Style.values().length];
            try {
                BeduinTabLayout.Style style = BeduinTabLayout.Style.f104412b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f104298a = iArr;
        }
    }

    public b(@k Context context) {
        this.f104297a = context;
    }
}
