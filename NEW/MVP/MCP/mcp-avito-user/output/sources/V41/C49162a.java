package v41;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.NoInitialContextException;

/* compiled from: JndiLookup.java */
/* renamed from: v41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49162a {

    /* renamed from: a, reason: collision with root package name */
    public static final org.slf4j.a f440458a = org.slf4j.b.d(C49162a.class);

    public static String a(String str) {
        org.slf4j.a aVar = f440458a;
        try {
            return (String) new InitialContext().lookup("java:comp/env/sentry/".concat(str));
        } catch (NamingException unused) {
            aVar.e("No /sentry/" + str + " in JNDI");
            return null;
        } catch (NoInitialContextException unused2) {
            aVar.e("JNDI not configured for Sentry (NoInitialContextEx)");
            return null;
        } catch (RuntimeException e12) {
            aVar.i("Odd RuntimeException while testing for JNDI", e12);
            return null;
        }
    }
}
