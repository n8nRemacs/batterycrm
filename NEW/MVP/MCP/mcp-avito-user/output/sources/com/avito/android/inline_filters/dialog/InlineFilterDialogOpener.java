package com.avito.android.inline_filters.dialog;

import Hr.InterfaceC14024a;
import android.os.Parcelable;
import cE.C27025b;
import com.avito.android.C0;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.W;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import lE.C43624b;

/* compiled from: InlineFilterDialogOpener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener;", "", "a", "Source", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface InlineFilterDialogOpener {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InlineFilterDialogOpener.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener$Source;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Source {

        /* renamed from: b, reason: collision with root package name */
        public static final Source f171141b;

        /* renamed from: c, reason: collision with root package name */
        public static final Source f171142c;

        /* renamed from: d, reason: collision with root package name */
        public static final Source f171143d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Source[] f171144e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f171145f;

        static {
            Source source = new Source("VERTICAL_MAIN", 0);
            f171141b = source;
            Source source2 = new Source("INLINE_FILTERS", 1);
            f171142c = source2;
            Source source3 = new Source("INLINE_FILTERS_SUGGEST_LOCATION", 2);
            f171143d = source3;
            Source[] sourceArr = {source, source2, source3};
            f171144e = sourceArr;
            f171145f = kotlin.enums.c.a(sourceArr);
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f171144e.clone();
        }
    }

    /* compiled from: InlineFilterDialogOpener.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener$a;", "", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: InlineFilterDialogOpener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    void RA(@Y61.k Filter filter, @Y61.k List list, @Y61.l Parcelable parcelable, @Y61.l SearchParams searchParams, @Y61.l InterfaceC30995b interfaceC30995b, @Y61.l W w12, @Y61.l InterfaceC31046f interfaceC31046f, @Y61.l com.avito.android.location.r rVar, @Y61.l CN.f fVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.k Y41.p pVar, @Y61.l Y41.l lVar, @Y61.k Y41.p pVar2, @Y61.k Y41.p pVar3, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar2, @Y61.l Y41.l lVar3, @Y61.l Source source, @Y61.l MetroResponseBody metroResponseBody, @Y61.l String str, @Y61.l String str2, @Y61.l Filter filter2, @Y61.l Filter filter3, @Y61.l Y41.l lVar4, @Y61.l InterfaceC14024a interfaceC14024a, @Y61.l com.avito.android.guests_selector.d dVar, @Y61.l C27025b c27025b, @Y61.l C0 c02, @Y61.l C43624b c43624b);

    @Y61.l
    Parcelable d0();

    void f2();

    void onPause();

    void onResume();
}
