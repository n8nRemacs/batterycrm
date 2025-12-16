package com.avito.android.developments_agency_search.screen.deal_room;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35845m2;
import i.AbstractC41201a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DealStageFilePickerContract.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/x;", "Li/a;", "Lkotlin/G0;", "Landroid/net/Uri;", "c", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class x extends AbstractC41201a<G0, Uri> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c f137815c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<List<String>> f137816d = C42727D.c(a.f137819l);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<String[]> f137817e = C42727D.c(b.f137820l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f137818b;

    /* compiled from: DealStageFilePickerContract.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<List<? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f137819l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends String> invoke() {
            return C42745f0.U("pdf", "jpg", "jpeg", "png", "doc", "docx", "xls", "xlsx", "zip");
        }
    }

    /* compiled from: DealStageFilePickerContract.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "", "invoke", "()[Ljava/lang/String;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String[]> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f137820l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String[] invoke() {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            x.f137815c.getClass();
            List<String> value = x.f137816d.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension((String) it.next());
                if (mimeTypeFromExtension != null) {
                    arrayList.add(mimeTypeFromExtension);
                }
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
    }

    /* compiled from: DealStageFilePickerContract.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/x$c;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    @Inject
    public x(@Y61.k InterfaceC35845m2 interfaceC35845m2) {
        this.f137818b = interfaceC35845m2;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, G0 g02) {
        f137815c.getClass();
        return this.f137818b.s(f137817e.getValue());
    }

    @Override // i.AbstractC41201a
    public final Uri parseResult(int i12, Intent intent) {
        if (i12 == -1 && intent != null) {
            return intent.getData();
        }
        return null;
    }
}
