package com.avito.android.util.paragraphs;

import OK0.e;
import PK0.f;
import Y61.k;
import android.text.Editable;
import com.avito.android.util.Z0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43059p;

/* compiled from: ParagraphPreFormatterV1.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/paragraphs/a;", "LNK0/a;", "<init>", "()V", "a", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements NK0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43059p f318954a = new C43059p("[\f\u0085\u2028]");

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C43059p f318955b = new C43059p("\n|\u000b|\r\n|\r|\u2029");

    /* renamed from: c, reason: collision with root package name */
    public final Pattern f318956c = Pattern.compile("\n|\u000b|\r\n|\r|\u2029");

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f318957d = Pattern.compile("[\f\u0085\u2028]");

    /* compiled from: ParagraphPreFormatterV1.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/util/paragraphs/a$a;", "", "<init>", "()V", "", "NEW_LINE", "Ljava/lang/String;", "NEW_LINE_SYMBOLS", "PARAGRAPH", "PARAGRAPH_SYMBOLS", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.paragraphs.a$a, reason: collision with other inner class name */
    public static final class C9887a {
        public /* synthetic */ C9887a(C42822w c42822w) {
            this();
        }

        public C9887a() {
        }
    }

    static {
        new C9887a(null);
    }

    @Inject
    public a() {
    }

    @Override // MK0.a
    @k
    public final String a(@k String str) {
        return this.f318954a.f(this.f318955b.f(str, "\n\n"), "\n");
    }

    @Override // MK0.a
    public final void b(@k Editable editable) {
        Matcher matcher = this.f318956c.matcher(editable);
        int iEnd = 0;
        while (matcher.find()) {
            editable.replace(matcher.start() + iEnd, matcher.end() + iEnd, "\n\n");
            int iStart = matcher.start() + iEnd;
            Z0.a(editable, new e(iStart + 1, iStart + 2, new f(null, 1, null)));
            iEnd += 2 - (matcher.end() - matcher.start());
        }
        Matcher matcher2 = this.f318957d.matcher(editable);
        while (matcher2.find()) {
            editable.replace(matcher2.start(), matcher2.end(), "\n");
        }
    }
}
