package n;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import j.InterfaceC42164u;
import j.N;
import j.P;
import j.X;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Compatibility.java */
@RestrictTo
/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44159a {

    /* compiled from: Compatibility.java */
    @X
    /* renamed from: n.a$a, reason: collision with other inner class name */
    public static class C11851a {
        @InterfaceC42164u
        @N
        public static Drawable a(@N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @InterfaceC42164u
        public static int b(@N TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @InterfaceC42164u
        public static void c(@N Drawable drawable, @N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }
}
