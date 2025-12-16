package com.avito.android.inline_filters.dialog;

import com.avito.android.remote.model.search.WidgetType;
import kotlin.Metadata;

/* compiled from: InlineFiltersDialogItemConverter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_inline-filters_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w {

    /* compiled from: InlineFiltersDialogItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172292a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Select.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.RadioSelect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetType.Multiselect.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f172292a = iArr;
        }
    }
}
