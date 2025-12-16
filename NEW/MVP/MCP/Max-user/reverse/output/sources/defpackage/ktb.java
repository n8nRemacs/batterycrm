package defpackage;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public abstract class ktb {
    public static ltb a(Person person) {
        IconCompat iconCompatA;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            iconCompatA = ob7.a(icon);
        } else {
            iconCompatA = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        ltb ltbVar = new ltb();
        ltbVar.a = name;
        ltbVar.b = iconCompatA;
        ltbVar.c = uri;
        ltbVar.d = key;
        ltbVar.e = zIsBot;
        ltbVar.f = zIsImportant;
        return ltbVar;
    }

    public static Person b(ltb ltbVar) throws FileNotFoundException {
        Person.Builder name = new Person.Builder().setName(ltbVar.a);
        IconCompat iconCompat = ltbVar.b;
        Icon iconG = null;
        if (iconCompat != null) {
            iconCompat.getClass();
            iconG = ob7.g(iconCompat, null);
        }
        return name.setIcon(iconG).setUri(ltbVar.c).setKey(ltbVar.d).setBot(ltbVar.e).setImportant(ltbVar.f).build();
    }
}
