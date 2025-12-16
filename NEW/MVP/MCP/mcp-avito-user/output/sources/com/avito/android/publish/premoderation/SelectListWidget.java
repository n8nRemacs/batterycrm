package com.avito.android.publish.premoderation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SelectListWidget.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/premoderation/SelectListWidget;", "Landroid/widget/LinearLayout;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SelectListWidget extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f238265b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.deprecated_design.radio_button.b f238266c;

    /* compiled from: SelectListWidget.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/premoderation/SelectListWidget$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f238267a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f238268b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f238269c;

        public a(@Y61.k String str, @Y61.l String str2, @Y61.k String str3) {
            this.f238267a = str;
            this.f238268b = str2;
            this.f238269c = str3;
        }
    }

    @X41.j
    @SuppressLint({"NewApi"})
    public SelectListWidget(@Y61.l Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SelectListWidget(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f238265b = new ArrayList();
        setOrientation(1);
    }
}
