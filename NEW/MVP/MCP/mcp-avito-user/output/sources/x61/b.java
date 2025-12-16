package X61;

import java.util.regex.Pattern;
import org.hamcrest.core.m;
import org.hamcrest.p;

/* compiled from: IsBlankString.java */
/* loaded from: classes7.dex */
public final class b extends p<String> {
    static {
        org.hamcrest.core.b.b(new m(), new b());
        Pattern.compile("\\s*");
    }

    @Override // org.hamcrest.m
    public final void a(org.hamcrest.a aVar) {
        aVar.d("a blank string");
    }
}
