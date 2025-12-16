package com.avito.android.gig_snippet;

import Y61.l;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: GigDateFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_snippet/a;", "", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: GigDateFormatter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.gig_snippet.a$a, reason: collision with other inner class name */
    public static final class C4709a {
        public static /* synthetic */ String a(a aVar, String str, String str2, String str3, int i12) {
            if ((i12 & 4) != 0) {
                str3 = null;
            }
            return aVar.e(str, str2, str3, (i12 & 8) == 0);
        }
    }

    @Y61.k
    String a(@Y61.k String str);

    @Y61.k
    String b(@Y61.k String str, @Y61.k String str2, @l String str3);

    @l
    Long c(@l String str);

    @l
    Date d(@Y61.k String str);

    @Y61.k
    String e(@Y61.k String str, @Y61.k String str2, @l String str3, boolean z12);

    @l
    String f(@l String str);

    @Y61.k
    String g(@l String str);
}
