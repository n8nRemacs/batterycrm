package com.avito.android.html_formatter.jsoup;

import javax.inject.Inject;
import kotlin.Metadata;
import org.jsoup.nodes.Document;

/* compiled from: JsoupHtmlNodeFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/I;", "LhJ/g;", "<init>", "()V", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class I implements hJ.g {
    @Inject
    public I() {
    }

    @Override // hJ.g
    @Y61.k
    public final a0 a(@Y61.k String str) {
        Document documentB = org.jsoup.parser.g.b(str);
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.f421045f = false;
        documentB.f421038j = outputSettings;
        return new a0(Document.g0(documentB));
    }

    @Override // hJ.g
    @Y61.k
    public final E b(@Y61.k String str) {
        Document documentB = org.jsoup.parser.g.b(str);
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.f421045f = false;
        documentB.f421038j = outputSettings;
        return new E(Document.g0(documentB));
    }
}
