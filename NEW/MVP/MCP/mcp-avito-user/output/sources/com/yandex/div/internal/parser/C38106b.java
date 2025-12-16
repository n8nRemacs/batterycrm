package com.yandex.div.internal.parser;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.json.ParsingException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.internal.parser.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C38106b implements C38107c.a, F {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f370138b;

    @Override // com.yandex.div.internal.parser.C38107c.a
    public void a(ParsingException parsingException) {
        switch (this.f370138b) {
            case 0:
                throw parsingException;
            default:
                return;
        }
    }

    @Override // com.yandex.div.internal.parser.F
    public boolean g(Object obj) {
        switch (this.f370138b) {
            case 2:
                C38106b c38106b = C38107c.f370139a;
                return true;
            case 3:
                C38106b c38106b2 = C38107c.f370139a;
                return true;
            default:
                return !((String) obj).isEmpty();
        }
    }

    private final void b(ParsingException parsingException) {
    }
}
