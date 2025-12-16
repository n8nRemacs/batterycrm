package defpackage;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
public abstract class a6a {
    public static final String[][] a = {new String[]{":-)", "😊"}, new String[]{":)", "😊"}, new String[]{":-(", "😞"}, new String[]{":(", "😞"}, new String[]{";-)", "😉"}, new String[]{";)", "😉"}, new String[]{":-D", "😂"}, new String[]{":D", "😂"}, new String[]{":-@", "😞"}, new String[]{":@", "😞"}, new String[]{"^o)", "😑"}, new String[]{":-S", "🙈"}, new String[]{":S", "🙈"}, new String[]{"*-)", "😏"}, new String[]{"*)", "😏"}, new String[]{":-|", "😠"}, new String[]{":|", "😠"}, new String[]{"8oI", "😡"}, new String[]{";(", "😢"}, new String[]{":'(", "😢"}, new String[]{":-P", "😜"}, new String[]{":P", "😜"}, new String[]{":-$", "😊"}, new String[]{":$", "😊"}, new String[]{":-O", "😳"}, new String[]{":O", "😳"}, new String[]{"|-)", "😪"}, new String[]{"|)", "😪"}, new String[]{"(ch)", "😊"}, new String[]{"(lo)", "😍"}, new String[]{"(sr)", "😔"}, new String[]{"|-(", "😴"}, new String[]{"|(", "😴"}, new String[]{"(H)", "😎"}, new String[]{"(hu)", "😬"}, new String[]{"(tr)", "😞"}, new String[]{"(md)", "😵"}, new String[]{"(fr)", "😄"}, new String[]{"(dt)", "😟"}, new String[]{"(sc)", "😬"}, new String[]{"(Y)", "👍"}, new String[]{"(N)", "👎"}, new String[]{"(v)", "✌"}, new String[]{"(L)", "❤"}, new String[]{"(U)", "💔"}, new String[]{"(K)", "💋"}, new String[]{"(F)", "⚘"}, new String[]{"(*)", "★"}, new String[]{"(^)", "🎂"}, new String[]{"(G)", "🎁"}, new String[]{"(B)", "🍺"}, new String[]{"(D)", "🍸"}, new String[]{"(CC)", "☕"}, new String[]{"(pi)", "🍕"}, new String[]{"(pl)", "🍴"}, new String[]{"(ic)", "🍦"}, new String[]{"($)", "💰"}, new String[]{"(co)", "💻"}, new String[]{"(so)", "⚽"}, new String[]{"(te)", "🎾"}, new String[]{"(nt)", "♬"}, new String[]{"(I)", "💡"}, new String[]{"(E)", "✉"}, new String[]{"(Z)", "👦"}, new String[]{"(X)", "👧"}, new String[]{"(S)", "🌙"}};

    public static Object a(Future future) {
        Object obj;
        if (!future.isDone()) {
            throw new IllegalStateException(mc4.e("Future was expected to be done: %s", future));
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final uzf b(pzf pzfVar) {
        String str;
        qzf qzfVar = qzf.a;
        if (pzfVar == null) {
            return qzfVar;
        }
        String str2 = pzfVar.d;
        String str3 = pzfVar.b;
        if ((pzfVar instanceof vzf) && (str = ((vzf) pzfVar).o) != null && str.length() != 0) {
            return new tzf(str);
        }
        if (str2 != null && str2.length() > 0) {
            return new tzf(str2);
        }
        if (qaj.c(str3 == null ? "" : str3) && "io.exception".equals(str3)) {
            return rzf.a;
        }
        if (str3 == null) {
            str3 = "";
        }
        return qaj.c(str3) ? szf.a : qzfVar;
    }

    public static bg7 c(Object obj) {
        return obj == null ? bg7.b : new bg7(obj);
    }
}
