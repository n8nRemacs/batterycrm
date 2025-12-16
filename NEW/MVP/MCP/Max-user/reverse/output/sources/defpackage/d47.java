package defpackage;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class d47 {
    public final String a;

    public d47(String str, int i) {
        switch (i) {
            case 1:
                str.getClass();
                this.a = str;
                break;
            case 2:
                this.a = str.concat("_");
                break;
            default:
                this.a = str;
                break;
        }
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public Mac b() {
        try {
            return Mac.getInstance(this.a);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("defined mac algorithm was not found", e);
        } catch (Exception e2) {
            throw new IllegalStateException("could not create mac instance in hkdf", e2);
        }
    }

    public String c(Object obj) {
        String string = obj.toString();
        if (string != null && string.length() != 0) {
            int length = string.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = string.codePointAt(iCharCount);
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return this.a + obj;
        }
        throw new IllegalArgumentException(wy1.h("Invalid key: ", string));
    }

    public String d(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }
}
