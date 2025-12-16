package kotlin.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/n;", "invoke", "()Lkotlin/text/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlin.text.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43060q extends kotlin.jvm.internal.N implements Y41.a<InterfaceC43057n> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C43059p f410626l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f410627m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43060q(C43059p c43059p, String str) {
        super(0);
        this.f410626l = c43059p;
        this.f410627m = str;
    }

    @Override // Y41.a
    public final InterfaceC43057n invoke() {
        Pattern pattern = this.f410626l.f410623b;
        String str = this.f410627m;
        Matcher matcher = pattern.matcher(str);
        if (matcher.find(0)) {
            return new C43058o(matcher, str);
        }
        return null;
    }
}
